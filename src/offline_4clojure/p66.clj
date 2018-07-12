;; Greatest Common Divisor - Easy
;; Given two integers, write a function which
;;returns the greatest common divisor.
;; tags - 
;; restricted - 
(ns offline-4clojure.p66
  (:use clojure.test))

(def __
;; your solution here

  (fn gcd [a b]
    (loop [a' (max a b)
           b' (min a b)]
      (let [r (rem b' a')]
        (if (zero? r)
          r
          (recur b' r)))))


  ;If a<b, exchange a and b.
  ;Divide a by b and get the remainder, r. If r=0, report b as the GCD of a and b.
  ;Replace a by b and replace b by r. Return to the previous step.
  ;
)

(defn -main []
  (are [soln] soln
(= (__ 2 4) 2)
(= (__ 10 5) 5)
(= (__ 5 7) 1)
(= (__ 1023 858) 33)
))
