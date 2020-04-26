# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like Create React App but with much less opinion and no need to "eject" from anything.

Want to understand the decision made for this project?  Read [Start a ClojureScript App from Scratch](https://betweentwoparens.com/start-a-clojurescript-app-from-scratch)

- [Housekeeping]
- [Quickstart]
- [Pro Tip]
  - [Add a Global Alias]
- [Notes]

## Housekeeping

- [Install Java]
- [Install Clojure]

## ClojureScript Version

Note that we are not using the latest version of `cljs` ([1.10.741]) because this version is not currently compatible with some features of `figwheel.main`.  Fortunatley for us, Bruce, the main man behind `figwheel.main`, is coming back in full force to [resolve many of these issues].

What does this mean for you?  Not much right now.  For many using this setup, you are likely not going to need the features provided by `1.10.741` so we can keep rocking out with `1.10.597` for a bit.

## QuickStart

As long as you have `clojure` installed you can follow these commands exactly and end up with a working CLJS project.

- Move to the directory where you want your ClojureScript app to live

- run `create-reagent-app`

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "1.0.199"}}}' \
    -m clj-new.create \
    https://github.com/tkjone/create-reagent-app@a0f6b829d91cbefe2f69dede72054538e080b012 \
    nike/fitness-app
  ```

> `nike` is an example of your `organization-name` and `fitness-app` is the name of your app.  Thus, the structure of that line should be  `organization-name/project-name` and the result is that it will generate a project structure like this:

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
    └── nike
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

## Pro Tips

### Add a Global Alias

Having to run the command above everytime we want to create a CLJS project is not a great Developer Experience.  So what I do is add a global alias.  To do this, follow these steps:

- Open your global `.clojure` directory

  ```bash
  atom ~/.clojure
  ```

  > Note that `atom` is _my_ editor.  If you're not using atom, replace `atom` with the CLI command for your editor of choice.  Or just open `~/.clojure` from inside of your editor.

- Add the following alias to the `deps.edn` file in `~/.clojure`

  ```clojure
  {:aliases
   {:create-reagent-app
    {:extra-deps {seancorfield/clj-new {:mvn/version "1.0.199"}}
     :main-opts  ["-m" "clj-new.create"
                  "https://github.com/tkjone/create-reagent-app@a0f6b829d91cbefe2f69dede72054538e080b012"]}}}
  ```

  > For a better understanding of what this file looks like you can look at [my dot-clojure] file and to see what a `dot-clojure` file like looking like when you're truly awesome at Clojure I highly encourage you to read and absorb [Sean Corfield's dot-clojure] file.

- Move into the directory you want your clojurescript project to live

- Run the above command:

  ```clj
  clj -A:create-reagent-app nike/fitness-app
  ```

Much better, yes?  Of course, whenever this project is updated, and you want those changes, you will have to update the `@a0f6b829d9...` portion of the `alias` to the latest version of this repo.   This is low effort though, and because of the stability, and low dep count of this project, you shouldn't need to worry about updating this very often.  Happy coding!

## Notes

The structure of `organization-name/project-name` is defined by `clj-new` and not this template.

[Housekeeping]: #housekeeping
[Quickstart]: #quickstart
[Pro Tip]: #pro-tip
[Notes]: #notes
[Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
[Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s
[1.10.741]: https://clojurescript.org/news/2020-04-24-release
[Add a Global Alias]: #add-an-global-alias
[resolve many of these issues]: https://www.clojuriststogether.org/news/q2-2020-funding-announcement/
[my dot-clojure]: https://github.com/athomasoriginal/dotfiles/blob/master/.clojure/deps.edn
[Sean Corfield's dot-clojure]: https://github.com/seancorfield/dot-clojure
