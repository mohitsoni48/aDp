# aDp
[![](https://jitpack.io/v/mohitsoni48/aDp.svg)](https://jitpack.io/#mohitsoni48/aDp)

See here why you need this: https://medium.com/@mohitsoni48/creating-pixel-perfect-ui-with-jetpack-compose-17376455f16b

## How to Install

Add it in your root build.gradle at the end of repositories:

```
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency

```
dependencies {
	implementation 'com.github.mohitsoni48:aDp:<Version>'
}
```

## How to Use
Initialize ADp in you application class/ Launching Activity like this
```
ADp.initializeAdp(this.resources, 360)
```

Replace `dp` with `aDp` and `sp` with `aSp` in your Jetpcak Compose

```
Text(
     text = "This text uses aSp\nDimensions to box are in aDp",
     fontSize = 16.aSp,
     modifier = Modifier
     .background(
        Color.LightGray
     )
     .padding(vertical = 20.aDp)
     .width(300.aDp)
)
```

### Note: This library is not optimized for foldable phones and tablets. Also If your device supports configuration changes, you will need to initialize again on each configuration change