(str "It was the panda " "in the library " "with a dust buster")

(if true "By Odin's Elbow!")

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)
(or (= 0 1) (= "yes" "no") "hello")
(or nil)

(and :free_wifi :hot_coffee)
(and :feelin_super_cool nil false)


(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])
failed-protagonist-names

(hash-map :a 1 :b 2)
(get {:a 0 :b 1} :c)
({:a 0 :b 1} :a)
(get {:a 0 :b 1} :c "unicorns?")
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])


(conj [1 2 3] 4)
(list 1 2 3 4)
(hash-set 1 1 2 2)
(set [3 3 3 4 4])
(contains? #{:a :b} :a)


(inc 1.1)
(map inc [0 1 2 3])
(#(* % 3) 8)


(loop [iteration 0]
  (println (str "Iteration " iteration))
  (if (> iteration 3)
    (println "Goodbye!")
    (recur (inc iteration))))


(defn recursive-printer
  ([]
     (recursive-printer 0))
  ([iteration]
     (println iteration)
     (if (> iteration 3)
       (println "Goodbye!")
       (recursive-printer (inc iteration)))))
(recursive-printer)

(re-find #"^left-" "left-eye")
(re-find #"^left-" "cleft-chin")
(re-find #"^left-" "wongleblart")

(reduce + [1 2 3 4])
(reduce + 15 [1 2 3 4])


(re-find #"^left-" "left-eye")
(re-find #"^left-" "cleft-chin")
(re-find #"^left-" "wongleblart")

(rand 30)