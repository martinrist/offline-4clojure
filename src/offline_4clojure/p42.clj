;; Factorial Fun - Easy
;; Write a function which calculates factorials.
;; tags - math
;; restricted - 
(ns offline-4clojure.p42
  (:use clojure.test))

(def __
  "Simple recursive factorial implementation"
  (fn fact [n]
    (if (= n 1)
      1
      (* n (fact (dec n))))))

(def __
  "Alternative version using loop / recur"
  (fn fact [n]
      (loop [count n acc 1]
        (if (zero? count)
          acc
          (recur (dec count) (* count acc))))))

(defn -main []
  (are [soln] soln
(= (__ 1) 1)
(= (__ 3) 6)
(= (__ 5) 120)
(= (__ 8) 40320)
))
