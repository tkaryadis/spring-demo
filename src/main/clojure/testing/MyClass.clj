(ns testing.MyClass
    (:gen-class
      :init init
      :state state
      :methods [[foo [] void]]))

(defn -init []
      [[] {:node (atom nil)}])

(defn -foo [this]
      (println "Called from Java!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" this))