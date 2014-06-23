(ns bootstrapping.routes.home
  (:require [compojure.core :refer :all]
            [bootstrapping.views.layout :as layout]))

(defn home []
  (layout/common
   [:div.container
    [:h1 "Hello World!"]
    [:div.row
     [:div.col-sm-6.col-md-6.col-lg-6
      [:p "This is stuff in the first column. "]
      [:p "more first column stuff"]]
     [:div.col-sm-6.col-md-6.col-lg-6
      [:p "And this is stuff in the second."]]]]))

(defroutes home-routes
  (GET "/" [] (home)))
