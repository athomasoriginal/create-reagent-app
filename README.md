# Create Reagent App

This project contains a `clj-new` template. This template is the one that I use when I want to quickly start a Reagent app.

## Housekeeping

- clj

## QuickStart

- Open `deps.edn` file and add

  ```clojure
  {:aliases
   {:new
    {:extra-deps {seancorfield/clj-new {:mvn/version "RELEASE"}}
     :main-opts  ["-m" "clj-new.create"]}}}
  ```

- Run the following command

  ```bash
  clj -A:new https://github.com/tkjone/create-reagent-app@317657dd6f671cb1c0fa9f1d5082600cb98607b1 myapp/special-app
  ```

  > The `myapp/special-app` is the name of your project. This is just an example so change it to whatever you like.

- Move into `special-app`

  ```bash
  cd special-app
  ```

- Start the app

  ```bash
  clj -A:dev
  ```

## Overview

When you specified `myapp/special-app` the `special-app` part is the name of your app whereas the `myapp` part would be the name of your group, business, organization etc. You can see this illustrated in the following structure

```bash
special-app
├── README.md
├── deps.edn
├── dev.cljs.edn
├── resources
│   └── public
│       ├── index.html
│       └── style.css
└── src
    └── myapp
        └── special_app.cljs
```
