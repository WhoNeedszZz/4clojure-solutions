(ns fourclojuresolutions.core
  (:gen-class)
  (:require
    [fourclojuresolutions.easy :as easy]))

(defn easy-solutions []
  (do
    (println "Last element")
    (println (easy/lastEl [1 2 3 4 5]))
    (println (easy/lastEl '(5 4 3)))
    (println (easy/lastEl ["b" "c" "d"]))))

(defn -main
  "4Clojure solutions"
  [& args]
  (do
    (println "Easy solutions:")
    (println)
    (easy-solutions)))
