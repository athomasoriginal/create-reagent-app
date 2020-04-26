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

As long as you have `clojure` installed you can following these commands exactly and end up with a working CLJS project.

- Move to the directory where you want your ClojureScript app to live:

- run `create-reagent-app`

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "1.0.199"}}}' \
    -m clj-new.create \
    https://github.com/tkjone/create-reagent-app@a0f6b829d91cbefe2f69dede72054538e080b012 \
    nike/fitness-app
  ```

> In the above example `nike` is an example of your `organization-name` and `fitness-app` is the name of your app.  Thus, the structure of that line should be  `organization-name/project-name` and the result is that it will generate a project structure like this:

```bash
fitness-app
├── README.md
├── deps.edn
├── dev.cljs.edn
├── resources
│   └── public
│       ├── index.html
│       └── style.css
├── src
│   └── nike
│       └── fitness_app.cljs
└── test
    └── organization-name
        └── fitness_app_test.cljs
```

- Move into `fitness-app`

  ```bash
  cd fitness-app
  ```

- Run the app for development

  ```bash
  clj -A:dev
  ```

## Notes

The structure of `organization-name/project-name` is defined by `clj-new` and not this template.

[Housekeeping]: #housekeeping
[Quickstart]: #quickstart
[Notes]: #notes
[Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
[Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s
[1.10.741]: https://clojurescript.org/news/2020-04-24-release
[resolve many of these issues]: https://www.clojuriststogether.org/news/q2-2020-funding-announcement/
