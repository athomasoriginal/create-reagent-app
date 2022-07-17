# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like
Create React App but with much less opinion and no need to "eject" from anything.

Want to understand the decisions made for this project?  Read [Start a ClojureScript App from Scratch]

- [Housekeeping]
- [Quickstart]
- [Pro Tips]
  - [Add a Global Alias]
  - [Using The Global Alias]
  - [Keeping Aliases Updated]
- [Notes]

## Housekeeping

Install the following before moving onto the `Quickstart`

- [Install Java]
- [Install Clojure]

**Note:** This guides assumes you're using a minimum of Clojure CLI Tools version `1.10.1.697` or later!  This is why you see see newer args passed to `clj`. (At the time of this writing anyways October 15, 2020).  Not sure which version you have?  Run the following command:

```bash
clj -h
```

The first lines of the output will look _something_ like this:

```bash
➜ clj -h
Version: 1.10.2.796
# ..
```

## QuickStart

- Move to a directory where you want your ClojureScript app to live

- Install `clj-new` as a clojure tool
  ```bash
  clojure -Ttools install com.github.seancorfield/clj-new \
    '{:git/tag "v1.2.399"}' :as clj-new
  ```
- Create app using `create-reagent-app`

  ```bash
  clojure -Tclj-new create \
    :template '"https://github.com/athomasoriginal/create-reagent-app@9765fdd8020887ed5caad49729d42ab9643a0793"' \
    :name nike/nike-app
  ```

The format of `:name` is `<org-name>/<app-name>`.  So in this case, if you were working for `nike`, you `org-name` would be `nike` and your `app-name` would be `fitness-app`.  See the [official clj-new docs] for more info on the args.

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
- Install JS deps
  ```bash
  yarn install
  ```
  > If you don't have `yarn` installed you can use `npm instead`
- Run the app for development

  ```bash
  clj -M:dev
  ```

## Pro Tips

### Add a Global Alias

The install directions show you the quick and dirty approach.  However, if you
find yourself starting projects more often than not and want to save yourself
some typing and the overhead of thinking about additional configuration.  To do
this:

- Open your global `.clojure` directory
  ```bash
  vim ~/.clojure
  ```
  > Note that `vim` is _my_ editor.  If you're not using `vim`, replace `vim`
  > with the CLI command for your editor of choice.  Or just open `~/.clojure`
  > from inside of your fav' editor.
- Add the following alias to the `deps.edn` file in `~/.clojure`
  ```clojure
  {:aliases
   ;; ...
   :new
   {:extra-deps {com.github.seancorfield/clj-new {:mvn/version "1.2.399"}}
    :exec-fn    clj-new/create
    :exec-args  {:template "https://github.com/athomasoriginal/create-reagent-app@d844d4119f81ad15757a975655992704dedf3046"}}}}
  ```
  > I called mine `new`, but you can call it anything you like.  For a better
  > understanding of what this file looks like you can look at
  > [my dot-clojure] file.  In addition, if you want to see another example of
  > what an amazing `dot-clojure` file looks like I highly encourage you to
  > take a look at [Sean Corfield's dot-clojure] file.

### Using The Global Alias

Assuming you have finished the [Add a Global Alias] step

- Move to a directory where you want your ClojureScript app to live

- Run the `create-reagent-app` alias:

  ```clj
  clj -X:create-reagent-app create :name nike/fitness-app
  ```

Much better, yes?

### Keeping aliases updated

Whenever this project updates, you will need to use the latest `hash` to take advantage of those changes.

- visit this repos [commit history]
- copy the latest `sha hash`
- replace the `sha hash` in your alias with the new `sha hash`

## Notes

The structure of `organization-name/project-name` is defined by `clj-new` and not this template.

[Housekeeping]: #housekeeping
[Quickstart]: #quickstart
[Pro Tips]: #pro-tips
[Notes]: #notes
[ClojureScript Version]: #clojurescript-version
[Using The Global Alias]: #using-the-global-alias
[Keeping Aliases Updated]: #keeping-aliases-updated


[Install Java]: https://www.youtube.com/watch?v=SljDPNwAFOc
[Install Clojure]: https://www.youtube.com/watch?v=5_q5pLoz9b0&t=2s
[1.10.741]: https://clojurescript.org/news/2020-04-24-release
[Add a Global Alias]: #add-a-global-alias
[resolve many of these issues]: https://www.clojuriststogether.org/news/q2-2020-funding-announcement/
[my dot-clojure]: https://github.com/athomasoriginal/dotfiles/blob/master/.clojure/deps.edn
[Sean Corfield's dot-clojure]: https://github.com/seancorfield/dot-clojure
[Add a Global Alias]: #add-a-global-alias
[Start a ClojureScript App from Scratch]: https://betweentwoparens.com/start-a-clojurescript-app-from-scratch
[official clj-new docs]: https://github.com/seancorfield/clj-new
[commit history]: https://github.com/athomasoriginal/create-reagent-app/commits/master
