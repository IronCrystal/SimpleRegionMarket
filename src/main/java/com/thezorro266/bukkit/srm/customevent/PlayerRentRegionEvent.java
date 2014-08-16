package com.thezorro266.bukkit.srm.customevent;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.thezorro266.bukkit.srm.factories.SignFactory;
 
public final class PlayerRentRegionEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private SignFactory.Sign sign;
    private boolean cancelled;
 
    public PlayerRentRegionEvent(Player player, SignFactory.Sign sign) {
        this.player = player;
        this.sign = sign;
    }
 
    public Player getPlayer() {
        return player;
    }
    
    public SignFactory.Sign getSign() {
        return sign;
    }
 
    @Override
	public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean arg0) {
		 this.cancelled = arg0;
	}
}