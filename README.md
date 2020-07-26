# zTournament

Pvp tournament plugin

## Get Tournament interface

Download API: https://github.com/Maxlego08/zTournament-API/releases/tag/1.0
<br>JavaDocs: https://docs.groupez.xyz/ztournament/

```java
Tournament tournament = getProvider(Tournament.class);


protected <T> T getProvider(Class<T> classz) {
    RegisteredServiceProvider<T> provider = getServer().getServicesManager().getRegistration(classz);
    if (provider == null) 
        return null;
    return provider.getProvider() != null ? (T) provider.getProvider() : null;
}
```

## Features

* Unlimited Arena
* All types of duel (1v1, 2v2, 3v3, 20v20, ...)
* Multi-arena system (there can be several duels in a single arena)
* Unlimited Kit
* Reward according to the position of the team
* Fully automatic

## Commands

* /tournament create \<team name> - Create a team (ztournament.team.create)
* /tournament join \<team name> - Join a team (ztournament.team.join)
* /tournament invite \<player> - Invite a player to your team (ztournament.team.invite)
* /tournament leave - Leave your team (ztournament.team.leave)
* /tournament version - Show plugin's version
* /tournament arena \<loc> - Create an arena (ztournament.arena)
* /tournament delete \<uuid> - Delete an arena (ztournament.delete)
* /tournament list - Show an arena (ztournament.arena.show)
* /tournament setlobby - Set lobby's position (ztournament.setlobby)
* /tournament stop - Shop a tournament (ztournament.stop)
* /tournament wave - Start next wave (ztournament.wave)
* /tournament start \<type> \<kit name> - Start tournament (ztournament.start)
* /tournament reload - Reload the plugin (ztournament.reload)
* /tournament kit - Show kit commands (ztournament.kit.use)
* /tournament kit list- Show kit list (ztournament.kit.use)
* /tournament kit show \<name> - Show kit content (ztournament.kit.use)
* /tournament kit create \<name> - Create an empty kit (ztournament.kit.use)
* /tournament kit edit \<name> - Edit a kit (ztournament.kit.use)
* /tournament kit delete \<name> - Edit a kit (ztournament.kit.use)
