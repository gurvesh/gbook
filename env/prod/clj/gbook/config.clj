(ns gbook.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[gbook started successfully]=-"))
   :middleware identity})
