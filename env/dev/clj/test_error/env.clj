(ns test-error.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [test-error.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[test-error started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-error has shut down successfully]=-"))
   :middleware wrap-dev})
