# Create Reagent App

Setup a ClojureScript/Reagent app in one command!

Want to learn more about this project?  Read [Start a ClojureScript App from Scratch](https://betweentwoparens.com/start-a-clojurescript-app-from-scratch)

## Housekeeping

- [clj](https://clojurescript.org/guides/quick-start)

## QuickStart

- Move to the directory where you want your ClojureScript to live and run:

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "0.7.7"}}}' \
    -m clj-new.create \
    https://github.com/tkjone/create-reagent-app@be36753ffaa89b083765beacf2401c73c133f656 \
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
