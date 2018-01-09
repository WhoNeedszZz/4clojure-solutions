(ns fourclojuresolutions.core
  (:gen-class)
  (:require
    [fourclojuresolutions.easy :as easy]))

(defn easy-solutions []
  (do
    (println "Last element")
    (println (easy/lastEl [1 2 3 4 5]))
    (println (easy/lastEl '(5 4 3)))
    (println (easy/lastEl ["b" "c" "d"]))
    (println "Penultimate")
    (println (easy/penultimate (list 1 2 3 4 5)))
    (println (easy/penultimate ["a" "b" "c"]))
    (println (easy/penultimate [[1 2] [3 4]]))))

(defn -main
  "4Clojure solutions"
  [& args]
  (do
    (println "Easy solutions:")
    (println)
    (easy-solutions)))
