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

(defn -main []
  (println "Hello, World!"))