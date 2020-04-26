# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like Create React App but with much less opinion and no need to "eject" from anything.

Want to understand the decision made for this project?  Read [Start a ClojureScript App from Scratch](https://betweentwoparens.com/start-a-clojurescript-app-from-scratch)

- [Housekeeping]
- [Quickstart]
- [Notes]

## Housekeeping

- [Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
- [Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s

## ClojureScript Version

Note that we are not using the latest version of `cljs` ([1.10.741]) because this version is not currently compatible with some features of `figwheel.main`.  Fortunatley for us, Bruce, the main man behind `figwheel.main`, is coming back in full force to [resolve many of these issues].

What does this mean for you?  Not much right now.  For many using this setup, you are likely not going to need the features provided by `1.10.741` so we can keep rocking out with `1.10.597` for a bit.

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

[Housekeeping]: #housekeeping
[Quickstart]: #quickstart
[Notes]: #notes
[Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
[Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s
[1.10.741]: https://clojurescript.org/news/2020-04-24-release
[resolve many of these issues]: https://www.clojuriststogether.org/news/q2-2020-funding-announcement/
