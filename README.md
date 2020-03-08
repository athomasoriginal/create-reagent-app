# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like Create React App but with much less opinion and no need to "eject" from anything.

Want to understand the decision made for this app structure?  Read [Start a ClojureScript App from Scratch](https://betweentwoparens.com/start-a-clojurescript-app-from-scratch)

## Housekeeping

Before you can use this tool you will need Java and Clojure installed locally.  Here are some resources which should help you get started:

- [Getting Started with Clojure](https://www.youtube.com/watch?v=SljDPNwAFOc&list=PLaGDS2KB3-ArG0WqAytE9GsZgrM-USsZA)

## QuickStart

- Move to the directory where you want your ClojureScript to live and run:

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "0.9.0"}}}' \
    -m clj-new.create \
    https://github.com/tkjone/create-reagent-app@8c17f0f454f631f9238aed6be19aa1ca3c78f0d4 \
    organization-name/project-name
  ```

> `organization-name/project-name` will become of your project and will generate a project structure like this:

```bash
project-name
├── README.md
├── deps.edn
├── dev.cljs.edn
├── resources
│   └── public
│       ├── index.html
│       └── style.css
├── src
│   └── organization-name
│       └── project-name.cljs
└── test
    └── organization-name
        └── project-name_test.cljs
```

- Move into `project-name`

  ```bash
  cd project-name
  ```

- Start the app

  ```bash
  clj -A:dev
  ```

## Notes

The structure of `organization-name/project-name` is defined by `clj-new` and not this template.  The reason I used these as the example is because it felt cleaner to describe it as `org/proj`.  Feel free to format however you like :)
