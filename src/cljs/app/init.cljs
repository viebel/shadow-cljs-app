(ns app.init
  (:require
    ["aws-sdk/global" :as aws]
    ["aws-sdk/clients/s3" :as s3]))


(defn init []
  (set! js/AWS aws))
