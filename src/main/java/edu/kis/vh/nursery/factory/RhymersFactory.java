package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    // TODO: Modifier 'public' is redundant for interface members
    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
