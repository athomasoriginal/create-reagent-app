# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like Create React App but with much less opinion and no need to "eject" from anything.

Want to understand the decision made for this project?  Read [Start a ClojureScript App from Scratch]

- [Housekeeping]
- [Quickstart]
- [Pro Tips]
  - [Add a Global Alias]
  - [Using The Global Alias]
- [Notes]

## Housekeeping

Please have the following installed before moving onto the `Quickstart` section.

- [Install Java]
- [Install Clojure]

## QuickStart

> Note: these instructions assume you are using the Clojure CLI version 1.10.1.697 or later!

Before starting, please be sure you've installed the required deps specified in `Housekeeping`.

- Move to the directory where you want your ClojureScript app to live

- run `create-reagent-app`

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "1.1.228"}}}' \
    -X clj-new/create \
    :template '"https://github.com/tkjone/create-reagent-app@723b6fef850b186c20ce3fc92390f92015be5113"' \
    :name nike/fitness-app
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
  clj -M:dev
  ```

## Pro Tips

### Add a Global Alias

I used the above command for two reasons:

- An example of using `-X` with clj-new/create
- No additional configuration needed

Having said this, the best thing is to add a global `.clojure` alias.  To do this, follow these steps:

- Open your global `.clojure` directory

  ```bash
  atom ~/.clojure
  ```

  > Note that `atom` is _my_ editor.  If you're not using `atom`, replace `atom` with the CLI command for your editor of choice.  Or just open `~/.clojure` from inside of your editor.

- Add the following alias to the `deps.edn` file in `~/.clojure`

  ```clojure
  {:aliases
   {:create-reagent-app
    {:extra-deps {seancorfield/clj-new {:mvn/version "1.1.228"}}
     :ns-default clj-new
     :exec-args  {:template "https://github.com/tkjone/create-reagent-app@723b6fef850b186c20ce3fc92390f92015be5113"}}}}
  ```

  > For a better understanding of what this file looks like you can look at [my dot-clojure] file.  In addition, if you want to see another example of what an amazing `dot-clojure` file looks like I highly encourage you to read and absorb [Sean Corfield's dot-clojure] file.

### Using The Global Alias

Assuming you have completed the step in [Add a Global Alias]

- Move into the directory you want your clojurescript project to live

- Run the `create-reagent-app` alias:

  ```clj
  clj -x:create-reagent-app :name nike/fitness-app
  ```

Much better, yes?  Of course, whenever this project is updated, and you want those changes, you will have to update the `@a0f6b829d9...` portion of the `alias` to the latest version of this repo.   This is low effort though, and because of the stability, and low dep count of this project, you shouldn't need to worry about updating this very often.  Happy coding!

## Notes

The structure of `organization-name/project-name` is defined by `clj-new` and not this template.

[Housekeeping]: #housekeeping
[Quickstart]: #quickstart
[Pro Tips]: #pro-tips
[Notes]: #notes
[ClojureScript Version]: #clojurescript-version
[Using The Global Alias]: #using-the-global-alias


[Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
[Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s
[1.10.741]: https://clojurescript.org/news/2020-04-24-release
[Add a Global Alias]: #add-a-global-alias
[resolve many of these issues]: https://www.clojuriststogether.org/news/q2-2020-funding-announcement/
[my dot-clojure]: https://github.com/athomasoriginal/dotfiles/blob/master/.clojure/deps.edn
[Sean Corfield's dot-clojure]: https://github.com/seancorfield/dot-clojure
[Add a Global Alias]: #add-a-global-alias
[Start a ClojureScript App from Scratch]: https://betweentwoparens.com/start-a-clojurescript-app-from-scratch
