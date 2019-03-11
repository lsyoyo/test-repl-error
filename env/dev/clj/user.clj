(ns user
  (:require [test-error.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [test-error.figwheel :refer [start-fw stop-fw cljs]]
            [test-error.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'test-error.core/repl-server))

(defn stop []
  (mount/stop-except #'test-error.core/repl-server))

(defn restart []
  (stop)
  (start))


