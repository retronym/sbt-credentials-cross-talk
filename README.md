## Demo of cross talk between `credentials := ` settings in multi-module SBT build

As discovered in https://github.com/scala/scala/pull/9658

```
> sbt publish
[info] welcome to sbt 1.5.3 (AdoptOpenJDK Java 16.0.1)
[info] loading global plugins from /Users/jz/.sbt/1.0/plugins
[info] loading project definition from /Users/jz/code/sbt-credentials-cross-talk/project
[info] loading settings for project sbt-credentials-cross-talk from build.sbt ...
[info] resolving key references (12654 settings) ...
[info] set current project to sbt-credentials-cross-talk (in build file:/Users/jz/code/sbt-credentials-cross-talk/)
sbt-credentials-cross-talk: Realm@host.org user-a/****
o: Realm@host.org user-a/****
f: Realm@host.org user-a/****
m: Realm@host.org user-a/****
j: Realm@host.org user-a/****
h: Realm@host.org user-a/****
e: Realm@host.org user-a/****
k: Realm@host.org user-a/****
a: Realm@host.org user-a/****
b: Realm@host.org user-a/****
l: Realm@host.org user-a/****
n: Realm@host.org user-a/****
i: Realm@host.org user-a/****
d: Realm@host.org user-a/****
c: Realm@host.org user-a/****
g: Realm@host.org user-a/****
```