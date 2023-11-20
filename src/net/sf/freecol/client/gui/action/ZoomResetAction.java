package net.sf.freecol.client.gui.action;

import net.sf.freecol.client.FreeColClient;

import java.awt.event.ActionEvent;

public class ZoomResetAction extends MapboardAction {

    public static final String id = "zoomResetAction";


    /**
     * Creates a new {@code ZoomResetAction}.
     *
     * @param freeColClient The {@code FreeColClient} for the game.
     */
    public ZoomResetAction(FreeColClient freeColClient) {
        super(freeColClient, id);
    }


    // Override FreeColAction

    /**
     * {@inheritDoc}
     */
    @Override
    protected boolean shouldBeEnabled() {
        if (!super.shouldBeEnabled()) return false;

        return getGUI().canZoomResetMap();
    }


    // Interface ActionListener

    /**
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        getGUI().zoomResetMap();
        update();
    }
}
