# Copyright (C) 2012-2013 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-phi.inc

PV = "3.19+git${SRCPV}"
PR = "r1"

# patches-3.19
SRCBRANCH = "patches-3.19"
SRCREV = "5fdbf2af0ad0e2f86210f1e9bc61dcbccb79aa73"

COMPATIBLE_MACHINE = "(mxs|mx3|mx5|mx6)"
