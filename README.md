# AppVisibilityDetector

## purpose

detect app visibility status

## feature

- auto detect the app go to background
- auto detect the app go to foreground

  > the screen turn around is also in consideration, you don't need to handle it your self

## how to use

AppVisibilityDetector implement in one java file, download [AppVisibilityDetector.java](https://github.com/zyc945/AppVisibilityDetector/blob/master/AppVisibilityDetectorLlib/src/main/java/com/zyc945/detector/AppVisibilityDetector.java) and add to you project may be the easiest way to use. I'll build a aar for gradle used later.

used examples:

> ```
>     AppVisibilityDetector.init(MyApp.this, new AppVisibilityCallback() {
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

the MyApp is your Application class.

> public class MyApp extends Application { ... }
