/*
 * Copyright (C) filoghost and contributors
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */
package me.filoghost.chestcommands.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Common interface extended by other interfaces, represents a simplified {@link Icon} with a settable click handler.
 * <p>
 * This interface exists to avoid having to implement {@link Icon#onLeftClick(MenuView, Player, boolean)} and {@link Icon#onRightClick(MenuView, Player, boolean)} via subclassing.
 *
 * @see ConfigurableIcon
 * @see StaticIcon
 * @since 1
 */
public interface ClickableIcon extends Icon {

    /**
     * Sets the click handler for this icon.
     *
     * @param clickHandler the new click handler, null to remove
     * @since 1
     */
    void setClickHandler(@Nullable ClickHandler clickHandler);

    /**
     * Returns the current click handler.
     *
     * @return the current click handler, null if absent
     * @since 1
     */
    @Nullable ClickHandler getClickHandler();

    /**
     * {@inheritDoc}
     * <p>
     * This default implementation delegates the left-click event to the current click handler. This method should not be
     * overridden.
     *
     * @since 1
     */
    @Override
    default void onLeftClick(@NotNull MenuView menuView, @NotNull Player clicker, boolean shift) {
        if (getClickHandler() != null) {
            getClickHandler().onLeftClick(menuView, clicker, shift);
        }
    }

    /**
     * {@inheritDoc}
     * <p>
     * This default implementation delegates the right-click event to the current click handler. This method should not be
     * overridden.
     *
     * @since 1
     */
    @Override
    default void onRightClick(@NotNull MenuView menuView, @NotNull Player clicker, boolean shift) {
        if (getClickHandler() != null) {
            getClickHandler().onRightClick(menuView, clicker, shift);
        }
    }

}
