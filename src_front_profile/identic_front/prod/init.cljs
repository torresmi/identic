(ns identic-front.init
    (:require [identic-front.core :as core]
              [identic-front.conf :as conf]))

(enable-console-print!)

(defn start-descjop! []
  (core/init! conf/setting))

(start-descjop!)
