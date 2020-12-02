# Create Reagent App

Setup a ClojureScript/Reagent app in one command.  This is meant to be used like Create React App but with much less opinion and no need to "eject" from anything.

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

The first lines of the output will look something like this:

```bash
➜ clj -h
Version: 1.10.1.708
# ..
```

## QuickStart

- Move to a directory where you want your ClojureScript app to live

- run `create-reagent-app`

  ```bash
  clj -Sdeps '{:deps
                {seancorfield/clj-new {:mvn/version "1.1.228"}}}' \
    -X clj-new/create \
    :template '"https://github.com/tkjone/create-reagent-app@518b9cb0b2c36daff44cc6fe1048512dfd938842"' \
    :name nike/fitness-app
  ```

The format of `:name` is `<org-name>/<app-name>`.  So in this case, if you were working for `nike`, you `org-name` would be `nike` and your `app-name` would be `fitness-app`.  Of course, you can be more create.  See the [official clj-new docs] for more info on the args.

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

I used the verbose command in the [QuickStart] section for two reasons:

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
     :exec-args  {:template "https://github.com/tkjone/create-reagent-app@518b9cb0b2c36daff44cc6fe1048512dfd938842"}}}}
  ```

  > For a better understanding of what this file looks like you can look at [my dot-clojure] file.  In addition, if you want to see another example of what an amazing `dot-clojure` file looks like I highly encourage you to read and absorb [Sean Corfield's dot-clojure] file.

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
