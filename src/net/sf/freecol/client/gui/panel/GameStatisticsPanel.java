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

public final class GameStatisticsPanel extends ReportPanel {

    private final List<Colony> colonies;

    /**
     * The constructor that will add the items to this panel.
     *
     * @param freeColClient The {@code FreeColClient} for the game.
     */
    public GameStatisticsPanel(FreeColClient freeColClient) {
        super(freeColClient, "GameStatistics");

        final Player player = getMyPlayer();

        this.colonies = player.getColonyList();

        JPanel goodsHeader = new MigPanel("GameStatisticsPanelUI");
        goodsHeader.setBorder(new EmptyBorder(20, 20, 0, 20));
        scrollPane.setColumnHeaderView(goodsHeader);

        final Specification spec = getSpecification();
        List<GoodsType> storableGoods = spec.getStorableGoodsTypeList();
        Market market = player.getMarket();

        // Display Panel
        reportPanel.removeAll();
        goodsHeader.removeAll();

        String layoutConstraints = "insets 0, gap 0 0";
        String columnConstraints = "[25%!, fill]["
                + (int) Math.round(ImageLibrary.ICON_SIZE.width * 1.25)
                + "!, fill]";
        String rowConstraints = "[fill]";

        reportPanel.setLayout(new MigLayout(layoutConstraints,
                columnConstraints, rowConstraints));
        goodsHeader.setLayout(new MigLayout(layoutConstraints,
                columnConstraints, rowConstraints));
        goodsHeader.setOpaque(true);

        JLabel emptyLabel = new JLabel();
        emptyLabel.setBorder(Utility.getTopLeftCellBorder());
        goodsHeader.add(emptyLabel, "cell 0 0");
    }
}
