(ns bootstrapping.views.layout
  (:require [hiccup.page :refer [html5 include-css include-js]]))

(defn common [& body]
  (html5
    [:head
     [:title "Welcome to bootstrapping"]
     (include-css "/css/screen.css")
     (include-css "/external/bootstrap/css/bootstrap.min.css")]
    [:body
     body
     (include-js "https://code.jquery.com/jquery.js")
     (include-js "/external/bootstrap/js/bootstrap.min.js")]))
