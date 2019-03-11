(ns test-error.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[test-error started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[test-error has shut down successfully]=-"))
   :middleware identity})
