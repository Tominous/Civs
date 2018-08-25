package org.redcastlemedia.multitallented.civs.regions;

import org.redcastlemedia.multitallented.civs.util.CVItem;

import java.util.List;

public class RegionUpkeep {
    private final List<List<CVItem>> reagents;
    private final List<List<CVItem>> inputs;
    private final List<List<CVItem>> outputs;
    private final double payout;

    public RegionUpkeep(List<List<CVItem>> reagents,
                        List<List<CVItem>> inputs,
                        List<List<CVItem>> outputs,
                        double payout) {
        this.reagents = reagents;
        this.inputs = inputs;
        this.outputs = outputs;
        this.payout = payout;
    }

    public List<List<CVItem>> getReagents() {
        return reagents;
    }

    public List<List<CVItem>> getInputs() {
        return inputs;
    }

    public List<List<CVItem>> getOutputs() {
        return outputs;
    }

    public double getPayout() {
        return payout;
    }
}
