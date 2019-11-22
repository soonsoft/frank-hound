package com.hbfintech.hound.core.event;

import com.hbfintech.hound.core.support.Hound;

/**
 * @author frank
 */
public class HoundSortedEvent extends HoundEvent
{
    /**
     * Used to listen for processed events for {@link com.hbfintech.hound.core.acceptor.sorter.Sorter}
     * @param source Hound instance that publish event
     * @param args Custom parameter
     */
    public HoundSortedEvent(
            Hound source,
            String[] args)
    {
        super(source, args);
    }
}