/*
 * Copyright (C) 2002 by Nick Sieger
 *
 * $Revision: 1.1 $
 * $Date: 2003/02/15 20:58:23 $
 *
 * Author: Nick Sieger <nsieger@bitstream.net>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package jde.juci;

/**
 * Simple implementation of the {@link Echo} interface.
 *
 * @author <a href="mailto:nsieger@bitstream.net">Nick Sieger</a>
 * @version 1.0
 */
public class EchoImpl implements Echo {

    public String ack(String message) {
        return message;
    }

    public Object roundTrip(Object input) {
        return input;
    }
}
