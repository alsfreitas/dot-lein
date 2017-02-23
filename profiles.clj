{:user {:plugins [[cider/cider-nrepl "0.14.0"]
                  [com.jakemccrary/lein-test-refresh "0.18.1"]
                  [lein-ancient "0.6.10"]
                  [lein-pprint "1.1.2"]
                  [lein-expectations "0.0.8"]]}
 :repl {:dependencies [[org.clojure/java.jdbc "0.7.0-alpha1"]
                       [com.oracle/ojdbc "12.1.0.2"]
                       ^:displace [org.clojure/clojure "1.9.0-alpha14"]]}}
