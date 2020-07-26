# zTournament

Pvp tournament plugin

## Get Tournament interface

Download API: https://github.com/Maxlego08/zTournament-API/releases/tag/1.0

```java
Tournament tournament = getProvider(Tournament.class);


protected <T> T getProvider(Class<T> classz) {
    RegisteredServiceProvider<T> provider = getServer().getServicesManager().getRegistration(classz);
    if (provider == null) 
        return null;
    return provider.getProvider() != null ? (T) provider.getProvider() : null;
}
```
