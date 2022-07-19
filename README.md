# Usage
This is intended to be used to create a mod aimed at various ranges of Minecraft versions.
It allows sharing common code between the implementations of the various versions.

```mermaid
flowchart TD
    common --> v1.18-v1.18.2
    common --> v1.17-v1.17.1
    common --> v1.16-v1.16.5
```

# Module Creation
1. Duplicate version module, it is recommended to use a name that specifies the version range of the module `vX-X-X-vX-X-X` (dots shouldn't be used).
2. Change version of module in `vX-X-X-vX-X-X/gradle.properties`
3. Include new module in root project in `settings.gradle` and load Gradle changes