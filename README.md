# BgDetector

## purpose

detect app visibility status

## feature

- auto detect the app go to background
- auto detect the app go to foreground

  > the screen turn around is also in consideration, you don't need to handle it your self

## how to use

AppVisibilityDetector implement in one java file, just download [AppVisibilityDetector.java](https://github.com/zyc945/AppVisibilityDetector/blob/master/AppVisibilityDetectorLlib/src/main/java/com/zyc945/detector/AppVisibilityDetector.java) and add to you project, enjoy it.

used examples:

> ```
>     AppVisibilityDetector.init(MyApp.this, new AppVisibleCallback() {
>         @Override
>         public void onAppGotoForeground() {
>             //app is from background to foreground
>         }
>         @Override
>         public void onAppGotoBackground() {
>             //app is from foreground to background
>         }
>     });
> ```

> the MyApp is your Application class. public class MyApp extends Application { ... }
