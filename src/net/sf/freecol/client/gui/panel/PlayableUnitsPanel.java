package net.sf.freecol.client.gui.panel;

import java.awt.*;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import net.sf.freecol.client.FreeColClient;
import net.sf.freecol.client.gui.ImageLibrary;
import net.sf.freecol.client.gui.label.MarketLabel;
import net.sf.freecol.client.gui.panel.*;
import net.sf.freecol.client.gui.panel.report.ReportPanel;
import net.sf.freecol.common.debug.FreeColDebugger;
import net.sf.freecol.common.i18n.Messages;
import net.sf.freecol.common.model.*;
import net.sf.freecol.common.model.FoundingFather.FoundingFatherType;

import static net.sf.freecol.common.util.CollectionUtils.*;


public class PlayableUnitsPanel extends FreeColPanel {

    public PlayableUnitsPanel(FreeColClient freeColClient) {
        super(freeColClient);
    }
}
