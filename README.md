# Pop

*Displaying toasts in a new way.*
A simple library to display toast messages with custom background and icon.

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
![success_image](https://user-images.githubusercontent.com/23124053/58546398-e260bb80-8222-11e9-8320-21a22fbc5d6c.png)

* Information
```java
1. Pop.info(context, getString(R.string.msg_info));
2. Pop.info(context, getString(R.string.msg_info), Toast.LENGTH_LONG));
3. Pop.info(context, getString(R.string.msg_info), Toast.LENGTH_LONG, Gravity.TOP));
```
![info_image](https://user-images.githubusercontent.com/23124053/58546455-03291100-8223-11e9-8c13-a30e3baeb928.png)


* Warning
```java
1. Pop.success(context, getString(R.string.msg_warn));
2. Pop.success(context, getString(R.string.msg_warn), Toast.LENGTH_LONG));
3. Pop.success(context, getString(R.string.msg_warn), Toast.LENGTH_LONG, Gravity.TOP));
```
![warning_image](https://user-images.githubusercontent.com/23124053/58546500-19cf6800-8223-11e9-8867-5940af68e125.png)

* Error
```java
1. Pop.error(context, getString(R.string.msg_error));
2. Pop.error(context, getString(R.string.msg_error), Toast.LENGTH_LONG));
3. Pop.error(context, getString(R.string.msg_error), Toast.LENGTH_LONG, Gravity.TOP));
```
![error_image](https://user-images.githubusercontent.com/23124053/58546502-1c31c200-8223-11e9-86b5-10a5a987cb4d.png)
