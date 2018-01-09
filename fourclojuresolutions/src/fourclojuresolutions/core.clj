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
    (println (easy/penultimate [[1 2] [3 4]]))
    (println "Nth element")
    (println (easy/nthEl '(4 5 6 7) 2))
    (println (easy/nthEl [:a :b :c] 0))
    (println (easy/nthEl [1 2 3 4] 1))
    (println (easy/nthEl '([1 2] [3 4] [5 6]) 2))
    (println "Count sequence")
    (println (easy/numEl '(1 2 3 3 1)))
    (println (easy/numEl "Hello World"))
    (println (easy/numEl [[1 2] [3 4] [5 6]]))
    (println (easy/numEl '(13)))
    (println (easy/numEl '(:a :b :c)))
    (println "Reverse a sequence")
    (println (easy/revSeq [1 2 3 4 5]))
    (println (easy/revSeq (sorted-set 5 7 2 7)))
    (println (easy/revSeq [[1 2] [3 4] [5 6]]))
    (println "Sum of sequence of numbers")
    (println (easy/sumSeq [1 2 3]))
    (println (easy/sumSeq (list 0 -2 5 5)))
    (println (easy/sumSeq #{4 2 1}))
    (println (easy/sumSeq '(0 0 -1)))
    (println (easy/sumSeq '(1 10 3)))
    (println "Return odd numbers")
    (println (easy/oddSeq #{1 2 3 4 5}))
    (println (easy/oddSeq [4 2 1 6]))
    (println (easy/oddSeq [2 2 4 6]))
    (println (easy/oddSeq [1 1 1 3]))))

(defn -main
  "4Clojure solutions"
  [& args]
  (do
    (println "Easy solutions:")
    (println)
    (easy-solutions)))
