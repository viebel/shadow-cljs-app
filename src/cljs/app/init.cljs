(ns app.init
  (:require
    ["aws-sdk" :as aws]))


(defn init []
  (! js/AWS aws))
