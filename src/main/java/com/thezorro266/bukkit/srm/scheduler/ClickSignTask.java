package com.thezorro266.bukkit.srm.scheduler;

import org.bukkit.entity.Player;

import com.thezorro266.bukkit.srm.factories.SignFactory;

public class ClickSignTask implements Runnable {
	private Player p;
	private SignFactory.Sign sign;
	
	public ClickSignTask(Player p, SignFactory.Sign sign) {
		this.p = p;
		this.sign = sign;
	}

	@Override
	public void run() {
		sign.getRegion().getTemplate().clickSign(p, sign);
	}

}
