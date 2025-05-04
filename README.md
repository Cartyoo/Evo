# Evo
Evo was made for use on [EvoMC.co](https://evomc.co) - to disable the modern hit sounds since it is running a modern version of Minecraft and has 1.8-style PvP.

## How does it work?
Evo uses ProtocolLib to listen on packets being sent to clients to prevent certain hit sounds being sent to the client. Without this, two hit sounds would play.

## Dependencies
- [ProtocolLib](https://github.com/dmulloy2/ProtocolLib/)

## What sounds are blocked?
- ENTITY_PLAYER_ATTACK_STRONG
- ENTITY_PLAYER_ATTACK_SWEEP
- ENTITY_PLAYER_ATTACK_NODAMAGE
- ENTITY_PLAYER_ATTACK_KNOCKBACK
- ENTITY_PLAYER_ATTACK_CRIT
- ENTITY_PLAYER_ATTACK_WEAK

# Note
This plugin has only been tested on Paper 1.21.4, and will likely never be updated unless the plugin breaks.

## Issues
If any issues arise, feel free to make a pull request or contact me on Discord [@herbert__](https://discord.com/users/832032090149093447)
