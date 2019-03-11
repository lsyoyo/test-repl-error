(ns test-error.routes.home
  (:require [test-error.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page [request]
  (layout/render request "home.html"))

(defroutes home-routes
  (GET "/" request (home-page request))
  (GET "/docs" []
       (-> (response/ok (-> "docs/docs.md" io/resource slurp))
           (response/header "Content-Type" "text/plain; charset=utf-8"))))

(comment
  (com.test.TestError/AMethod)

  )
