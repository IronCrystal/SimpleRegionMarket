package com.thezorro266.bukkit.srm.customevent;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.thezorro266.bukkit.srm.factories.RegionFactory;
import com.thezorro266.bukkit.srm.templates.TemplateRent;

public class RegionExpireEvent extends Event {
	private static final HandlerList handlers = new HandlerList();
	private RegionFactory.Region region;
	private OfflinePlayer customer;
	private OfflinePlayer owner;
	private TemplateRent template;
	
	public RegionExpireEvent(RegionFactory.Region region, OfflinePlayer customer, OfflinePlayer owner, TemplateRent template) {
		this.region = region;
		this.customer = customer;
		this.owner = owner;
		this.template = template;
	}
	

	@Override
	public HandlerList getHandlers() {
        return handlers;
    }
 
    public static HandlerList getHandlerList() {
        return handlers;
    }

	public RegionFactory.Region getRegion() {
		return region;
	}

	public OfflinePlayer getCustomer() {
		return customer;
	}

	public OfflinePlayer getOwner() {
		return owner;
	}


	public TemplateRent getTemplate() {
		return template;
	}
}
