# zTournament

Pvp tournament plugin

## Get Tournament interface

```java
Tournament tournament = getProvider(Tournament.class);


protected <T> T getProvider(Class<T> classz) {
    RegisteredServiceProvider<T> provider = getServer().getServicesManager().getRegistration(classz);
    if (provider == null) 
        return null;
    return provider.getProvider() != null ? (T) provider.getProvider() : null;
}
```
