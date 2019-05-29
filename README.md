# Pop

Displaying toasts in a new way.

## How to

1. Add the JitPack repository to your build file.\
*Add it in your root build.gradle at the end of repositories*


```gradle
allprojects {
   repositories {
        ...
	    maven { url 'https://jitpack.io' }
   }
}
```

2. Add the dependency

```gradle
dependencies {
	        implementation 'com.github.mainong-jenbum:pop:0.1.0'
}

```

## Usage

* Success
```java
1. Pop.success(context, getString(R.string.msg_success));
2. Pop.success(context, getString(R.string.msg_success), Toast.LENGTH_LONG));
3. Pop.success(context, getString(R.string.msg_success), Toast.LENGTH_LONG, Gravity.TOP));
```
[[https://github.com/mainong-jenbum/pop/tree/master/app/src/main/res/drawable/success_image.png|alt=octocat]]

* Information
```java
1. Pop.info(context, getString(R.string.msg_info));
2. Pop.info(context, getString(R.string.msg_info), Toast.LENGTH_LONG));
3. Pop.info(context, getString(R.string.msg_info), Toast.LENGTH_LONG, Gravity.TOP));
```
[[https://github.com/mainong-jenbum/pop/tree/master/app/src/main/res/drawable/info_image.png|alt=octocat]]


* Warning
```java
1. Pop.success(context, getString(R.string.msg_warn));
2. Pop.success(context, getString(R.string.msg_warn), Toast.LENGTH_LONG));
3. Pop.success(context, getString(R.string.msg_warn), Toast.LENGTH_LONG, Gravity.TOP));
```
[[https://github.com/mainong-jenbum/pop/tree/master/app/src/main/res/drawable/warning_image.png|alt=octocat]]

* Error
```java
1. Pop.error(context, getString(R.string.msg_error));
2. Pop.error(context, getString(R.string.msg_error), Toast.LENGTH_LONG));
3. Pop.error(context, getString(R.string.msg_error), Toast.LENGTH_LONG, Gravity.TOP));
```
[[https://github.com/mainong-jenbum/pop/tree/master/app/src/main/res/drawable/error_image.png|alt=octocat]]
