# CSCi4651-Clojure

This is a project to demonstrate Clojure features and provide a setup for testing for CSci 4651 at UMN Morris. 

## How to open
Clone the project and open the entire folder in Atom. 

## How to run
In the project directory (csci4651) type:
   * `lein repl` to load the `core.clj` file and start repl. You can call any of the functions defined in core, for example `(intro-let [1 2 3])`
   * `lein run` to run the function `hello` in `core.clj`. Note that any prints outside of the functions will print.  
   * `lein test` to run tests in `test/csci4651/core_test.clj`. You may add more tests there. Since `csci4651.core` namespace is referenced there, any function in `core` can be called. 

Make sure to save all the modified files before rerunning. 
   
