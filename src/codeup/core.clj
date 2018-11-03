(ns codeup.core
  (:gen-class))

(defn a1001 []
  (println "Hello"))

(defn a1002 []
  (println "Hello World"))

(defn a1003 []
  (println "Hello\nWorld"))

(defn a1004 []
  (println "'Hello'"))

(defn a1005 []
  (println "\"Hello World\""))

(defn a1006 []
  (println "!@#$%^&*()"))

(defn a1007 []
  (println "\"C:\\Download\\hello.cpp\""))

(defn a1010 []
  (let [n (read-line)]
    (println (format "%d" (read-string n)))
    n))

(defn a1011 []
  (let [n (read-line)]
    (println (format "%s" n))
    n))

(defn a1012 []
  (let [n (read-line)]
    (println (format "%f" (read-string n)))
    n))

(defn a1013 []
  (let [n1 (read-line) 
        n2 (read-line)]
    (println n1 n2)
    n1 n2))

(defn a1014 []
  (let [n1 (read-line)
        n2 (read-line)]
    (println n2 n1)
    n1 n2))

(defn a1015 []
  (let [n (read-line)]
    (println (format "%.2f" (read-string n)))
    n))

(defn a1017 []
  (let [n (read-line)]
    (println n n n)
    n))

(defn -main []
  (println "Hello, World!"))