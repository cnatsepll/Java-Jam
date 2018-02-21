package net.jerickson.javajam.combatant;

import net.jerickson.javajam.weapon.DamageType;
import net.jerickson.javajam.weapon.Strikable;

/**
 * Fightable
 */
public interface Fightable {
    int dealDamage();
    int getHealth();
    int takeDamage(int damage, DamageType type);
    DamageType getDamageType();
    boolean isDead();
    void setWeapon(Strikable newWeapon);
    String toString();
    Strikable getWeapon();
}