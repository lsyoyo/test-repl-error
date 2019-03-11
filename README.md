# test-error

This project is generated using `luminus` by command:

    lein new luminus test-error +site

The only addon is shown in commit 2.

 1. A test java file is put in `src/java`.
 1. The file is referred in `clj/routes/home.clj`
 1. `project.clj`. added `java-source-paths` to include the src path.

Steps to re-produce the error:

 1. `lein clean`
 1. `lein repl`

And a single line of change to make it work. comment out `routes/home.clj:6` the
line importing the java code. And **interestingly**, if a repl is run after the
the line is commented out, the line can be un-commented and "eval"=ed without
issue in repl.

Base on the above observation, my suspicion is. somehow *javac* task is not run
properly before *compile* because of that single line of `routes/home.clj:6`?
