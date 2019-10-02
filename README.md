# How to reproduce the issue:
- run `./gradlew publishToMavenLocal`
- uncomment `build.gradle.kts` line 7 (`id("jacoco-convention") version "1.0"`)
- try to sync AS or run any gradle task

what is the failure:
> Could not apply requested plugin [id: 'jacoco-convention', version: '1.0'] as it does not provide a plugin with id 'jacoco-convention'. This is caused by an incorrect plugin implementation. Please contact the plugin author(s).
>
>  &gt; Plugin with id 'jacoco-convention' not found.

Fix ( workaround ):
removing the group from the gradle.properties fixes the issue, the plugin is found ( no need to republish the plugin
 ), it doesn't matter if you add the group to the build.gradle.kts in any way. 